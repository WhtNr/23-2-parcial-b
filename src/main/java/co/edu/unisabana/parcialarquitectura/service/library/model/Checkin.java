package co.edu.unisabana.parcialarquitectura.service.library.model;

import lombok.Data;

@Data
public class Checkin {

  private final String facility;

  private final String driver;

  private final int dayOfMonth;
  private int id;

}