/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.claro.autodiagnosticoincidentesnegocios.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author gachae
 */
public class ContentDTO {

    private List<ContentItem> content;

    @JsonProperty("content")
    public List<ContentItem> getContent() {
        return content;
    }

    public void setContent(List<ContentItem> content) {
        this.content = content;
    }

    public static class ContentItem {

        private IncidentDFO incidentDFO;

        @JsonProperty("IncidentDFO")
        public IncidentDFO getIncidentDFO() {
            return incidentDFO;
        }

        public void setIncidentDFO(IncidentDFO incidentDFO) {
            this.incidentDFO = incidentDFO;
        }
    }

    public static class IncidentDFO {

        private String affectedCI;
        private String assignmentGroup;
        private String cIAfectado;
        private String incidentID;
        private String iniIntServ;
        private String otID;
        private String otStatus;
        private String finIntServ;
        private boolean open;
        private String openTime;
        private String service;
        private List<String> solution;
        private String status;
        private String tareaDatos;
        private String tareaPlanta;
        private String title;
        private String userPriority;
        private String kMDoc;

        @JsonProperty("KMDoc")
        public String getkMDoc() {
            return kMDoc;
        }

        public void setkMDoc(String kMDoc) {
            this.kMDoc = kMDoc;
        }

        @JsonProperty("FinIntServ")
        public String getFinIntServ() {
            return finIntServ;
        }

        public void setFinIntServ(String finIntServ) {
            this.finIntServ = finIntServ;
        }

        @JsonProperty("AffectedCI")
        public String getAffectedCI() {
            return affectedCI;
        }

        public void setAffectedCI(String affectedCI) {
            this.affectedCI = affectedCI;
        }

        @JsonProperty("AssignmentGroup")
        public String getAssignmentGroup() {
            return assignmentGroup;
        }

        public void setAssignmentGroup(String assignmentGroup) {
            this.assignmentGroup = assignmentGroup;
        }

        @JsonProperty("CIAfectado")
        public String getCIAfectado() {
            return cIAfectado;
        }

        public void setCIAfectado(String cIAfectado) {
            this.cIAfectado = cIAfectado;
        }

        @JsonProperty("IncidentID")
        public String getIncidentID() {
            return incidentID;
        }

        public void setIncidentID(String incidentID) {
            this.incidentID = incidentID;
        }

        @JsonProperty("IniIntServ")
        public String getIniIntServ() {
            return iniIntServ;
        }

        public void setIniIntServ(String iniIntServ) {
            this.iniIntServ = iniIntServ;
        }

        @JsonProperty("OTID")
        public String getOTID() {
            return otID;
        }

        public void setOTID(String otID) {
            this.otID = otID;
        }

        @JsonProperty("OTStatus")
        public String getOTStatus() {
            return otStatus;
        }

        public void setOTStatus(String otStatus) {
            this.otStatus = otStatus;
        }

        @JsonProperty("Open")
        public boolean isOpen() {
            return open;
        }

        public void setOpen(boolean open) {
            this.open = open;
        }

        @JsonProperty("OpenTime")
        public String getOpenTime() {
            return openTime;
        }

        public void setOpenTime(String openTime) {
            this.openTime = openTime;
        }

        @JsonProperty("Service")
        public String getService() {
            return service;
        }

        public void setService(String service) {
            this.service = service;
        }

        @JsonProperty("Solution")
        public List<String> getSolution() {
            return solution;
        }

        public void setSolution(List<String> solution) {
            this.solution = solution;
        }

        @JsonProperty("Status")
        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        @JsonProperty("TareaDatos")
        public String getTareaDatos() {
            return tareaDatos;
        }

        public void setTareaDatos(String tareaDatos) {
            this.tareaDatos = tareaDatos;
        }

        @JsonProperty("TareaPlanta")
        public String getTareaPlanta() {
            return tareaPlanta;
        }

        public void setTareaPlanta(String tareaPlanta) {
            this.tareaPlanta = tareaPlanta;
        }

        @JsonProperty("Title")
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        @JsonProperty("UserPriority")
        public String getUserPriority() {
            return userPriority;
        }

        public void setUserPriority(String userPriority) {
            this.userPriority = userPriority;
        }

        @Override
        public String toString() {
            return "IncidentDFO{" + "affectedCI=" + affectedCI + ", assignmentGroup=" + assignmentGroup + ", cIAfectado=" + cIAfectado + ", incidentID=" + incidentID + ", iniIntServ=" + iniIntServ + ", otID=" + otID + ", otStatus=" + otStatus + ", finIntServ=" + finIntServ + ", open=" + open + ", openTime=" + openTime + ", service=" + service + ", solution=" + solution + ", status=" + status + ", tareaDatos=" + tareaDatos + ", tareaPlanta=" + tareaPlanta + ", title=" + title + ", userPriority=" + userPriority + ", kMDoc=" + kMDoc + '}';
        }

    }

}
