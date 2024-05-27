package it.epicode.ProgettoSettimanale.records;

import it.epicode.ProgettoSettimanale.entities.Dipendente;
import it.epicode.ProgettoSettimanale.entities.Status;
import it.epicode.ProgettoSettimanale.entities.TipoDispositivo;
import jakarta.validation.constraints.NotNull;


public record DispositivoValidation(


        Long id,
        @NotNull
        Status status,
        @NotNull
        TipoDispositivo tipoDispositivo,

        Dipendente dipendente
) {
}
