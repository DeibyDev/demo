/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.claro.autodiagnosticoincidentesnegocios.services;

import co.com.claro.autodiagnosticoincidentesnegocios.conexion.ConexionServiceManager;
import co.com.claro.autodiagnosticoincidentesnegocios.dto.ContentDTO;
import co.com.claro.autodiagnosticoincidentesnegocios.dto.IMData;
import co.com.claro.autodiagnosticoincidentesnegocios.dto.IMNotaDTO;
import co.com.claro.autodiagnosticoincidentesnegocios.dto.IncidenteActividadDTO;
import com.fasterxml.jackson.databind.JsonNode;

//Prueba
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import java.util.Base64;
import java.util.List;
import com.google.gson.Gson;
import java.io.DataOutputStream;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;

/**
 *
 * @author gachae
 */
@Stateless
public class GetIncidentesServiceRestImpl implements GetIncidentesServiceRest {

    public static ObjectMapper objectMapper = new ObjectMapper();
    ContentDTO contentDTO;

    @Override
    public ContentDTO getIncidentes() {

        try {
            String conexionSM = ConexionServiceManager.userServiceManager() + ":" + ConexionServiceManager.passServiceManager();
            byte[] autenticacionEB = Base64.getEncoder().encode(conexionSM.getBytes());
            String autenticacionSE = new String(autenticacionEB);

            String urlWS = "http://" + ConexionServiceManager.urlServiceManager() + ":"
                    + ConexionServiceManager.puertoServiceManager()
                    + "/SM/9/rest/incidentsDFO?query=Open=true%26("
                    + "AssignmentGroup=%22EYN%20%2D%20NOC%20Negocios%22"
                    + "or%20AssignmentGroup%23%22EYN%20%2D%20NOC%20Negocios%20Prevenci%C3%B3n%22"
                    + "or%20AssignmentGroup%23%22EYN%20%2D%20Soporte%20Back%20Negocios%22"
                    + "or%20AssignmentGroup%23%22EYN%20%2D%20Soporte%20IRE%20Negocios%22"
                    + "or%20AssignmentGroup%23%22EYN%20%2D%20Soporte%20Negocios%20GI%22"
                    + "or%20AssignmentGroup%23%22EYN%20%2D%20Soporte%20Negocios%20AST%22"
                    + "or%20AssignmentGroup%23%22EYN%20%2D%20Soporte%20Negocios%20COS%22"
                    + "or%20AssignmentGroup%23%22EYN%20%2D%20Soporte%20Negocios%20Nexa%22"
                    + "or%20AssignmentGroup%23%22EYN%20%2D%20Proactividad%20Negocios%20VIP%22)%26"
                    + "Status%3C%3E%22Resolved%22&view=expand&sort=OpenTime:descending";

            URL urlRequest = new URL(urlWS);
            HttpURLConnection conector = (HttpURLConnection) urlRequest.openConnection();

            conector.setDoOutput(true);
            conector.setRequestMethod("GET");
            conector.setRequestProperty("content-type", "application/json");
            conector.setRequestProperty("Authorization", "Basic " + autenticacionSE);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(conector.getInputStream(), StandardCharsets.UTF_8));

            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = bufferedReader.readLine()) != null) {
                response.append(inputLine).append("\n");
            }

            bufferedReader.close();
            conector.disconnect();

            return cortarJson(response.toString());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return contentDTO;
        }

    }

    public static ContentDTO cortarJson(String response) {

        ContentDTO contentDTO = new ContentDTO();

        try {
            JsonNode rootNode = objectMapper.readTree(response);
            JsonNode contentNode = rootNode.path("content");

            if (contentNode.isArray()) {
                List<ContentDTO.ContentItem> contentItems = new ArrayList<>();

                for (JsonNode node : contentNode) {
                    JsonNode incidentNode = node.path("IncidentDFO");
                    String result = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(incidentNode);
                    ContentDTO.IncidentDFO incidentDFO = objectMapper.readValue(result, ContentDTO.IncidentDFO.class);

                    // Crear el ContentItem y agregar el IncidentDFO
                    ContentDTO.ContentItem contentItem = new ContentDTO.ContentItem();
                    contentItem.setIncidentDFO(incidentDFO);

                    // Agregar el ContentItem a la lista
                    contentItems.add(contentItem);
                }

                contentDTO.setContent(contentItems);
            } else {
                throw new IOException("El nodo 'content' no es un array.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return contentDTO;
    }

    @Override
    public void crearNotaTrabajo(String titulo, String tipoActualizacion, String notaTrabajo, String estado) {
        System.out.println("Nota de trabajo creada para : " + titulo + "\n" + tipoActualizacion + "\n" + notaTrabajo + "\n" + estado);
    }

    @Override
    public void crearActividadIncidenteMayor(IncidenteActividadDTO actividadDTO) {
        String conexionSM = ConexionServiceManager.userServiceManager() + ":" + ConexionServiceManager.passServiceManager();
        byte[] autenticacionEB = Base64.getEncoder().encode(conexionSM.getBytes());
        String autenticacionSE = new String(autenticacionEB);

        String urlWS = "http://" + ConexionServiceManager.urlServiceManager() + ":"
                + ConexionServiceManager.puertoServiceManager() + "SM/9/rest/Incidentactivities";

        URL urlRequest;
        try {
            urlRequest = new URL(urlWS);
            HttpURLConnection conector = (HttpURLConnection) urlRequest.openConnection();

            conector.setDoOutput(true);
            conector.setRequestMethod("POST");
            conector.setRequestProperty("content-type", "application/json");
            conector.setRequestProperty("Authorization", "Basic " + autenticacionSE);

            Gson gson = new Gson();
            String jsonInputString = gson.toJson(actividadDTO);

            try (DataOutputStream wr = new DataOutputStream(conector.getOutputStream())) {
                byte[] input = jsonInputString.getBytes(StandardCharsets.UTF_8);
                wr.write(input, 0, input.length);
            }
            int responseCode = conector.getResponseCode();
            System.out.println("Response Code: " + responseCode);
            if (responseCode == HttpURLConnection.HTTP_OK) {
                try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(conector.getInputStream(), StandardCharsets.UTF_8))) {
                    String inputLine;
                    StringBuilder response = new StringBuilder();

                    while ((inputLine = bufferedReader.readLine()) != null) {
                        response.append(inputLine);
                    }
                    // Maneja la respuesta aquí
                    System.out.println(response.toString());
                }
            } else {
                System.out.println("POST request failed. Response Code: " + responseCode);
            }

        } catch (MalformedURLException ex) {
            Logger.getLogger(GetIncidentesServiceRestImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GetIncidentesServiceRestImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void actualizarActividadIncidenteMayor(String incidentId, IMNotaDTO imndto) {
        try {
            String conexionSM = ConexionServiceManager.userServiceManager() + ":" + ConexionServiceManager.passServiceManager();
            byte[] autenticacionEB = Base64.getEncoder().encode(conexionSM.getBytes());
            String autenticacionSE = new String(autenticacionEB);

            String urlWS = "http://" + ConexionServiceManager.urlServiceManager() + ":"
                    + ConexionServiceManager.puertoServiceManager() + "SM/9/rest/IMNotas/";

            URL url = new URL(urlWS + incidentId);
            HttpURLConnection conector = (HttpURLConnection) url.openConnection();

            // Configurar el método PUT
            conector.setRequestMethod("PUT");
            conector.setDoOutput(true);
            conector.setRequestProperty("Content-Type", "application/json");
            conector.setRequestProperty("Authorization", "Basic " + autenticacionSE);

            Gson gson = new Gson();
            String jsonInputString = gson.toJson(imndto);

            // Enviar el JSON en el cuerpo de la solicitud
            try (DataOutputStream wr = new DataOutputStream(conector.getOutputStream())) {
                byte[] input = jsonInputString.getBytes(StandardCharsets.UTF_8);
                wr.write(input, 0, input.length);
            }

            // Leer la respuesta
            int responseCode = conector.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            if (responseCode == HttpURLConnection.HTTP_OK) {
                try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(conector.getInputStream(), StandardCharsets.UTF_8))) {
                    String inputLine;
                    StringBuilder response = new StringBuilder();

                    while ((inputLine = bufferedReader.readLine()) != null) {
                        response.append(inputLine);
                    }
                    // Manejar la respuesta aquí
                    System.out.println(response.toString());
                }
            } else {
                System.out.println("PUT request failed. Response Code: " + responseCode);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
