package com.sanisidro.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ReniecResponse {
  @JsonProperty("first_name")
  private String firstName;
  
  @JsonProperty("first_last_name")
  private String firstLastName;
  
  @JsonProperty("second_last_name")
  private String secondLastName;
  
  @JsonProperty("document_number")
  private String documentNumber;
  
  @JsonProperty("full_name")
  private String fullName;
  
  // Método helper para obtener el nombre completo si no viene en la respuesta
  public String getFullName() {
    if (fullName != null && !fullName.isEmpty()) {
      return fullName;
    }
    return (firstName != null ? firstName : "") + " " + 
           (firstLastName != null ? firstLastName : "") + " " + 
           (secondLastName != null ? secondLastName : "");
  }
}
