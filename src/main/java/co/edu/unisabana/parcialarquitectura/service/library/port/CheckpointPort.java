package co.edu.unisabana.parcialarquitectura.service.library.port;

import co.edu.unisabana.parcialarquitectura.service.library.model.Checkin;
import co.edu.unisabana.parcialarquitectura.service.library.model.Checkout;

public interface CheckpointPort {

  void saveCheckout(Checkout checkpoints);

  Checkin findLastCheckin(String driver, String facility);

  void finishCheckin(Checkin checkin);
}