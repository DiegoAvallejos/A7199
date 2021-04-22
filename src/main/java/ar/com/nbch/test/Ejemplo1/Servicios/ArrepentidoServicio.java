package ar.com.nbch.test.Ejemplo1.Servicios;

import ar.com.nbch.test.Ejemplo1.modelos.ModelArrepentido;
import ar.com.nbch.test.Ejemplo1.modelos.ModelRtaArrepentido;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.Timestamp;

@Service
public class ArrepentidoServicio {

    public ModelRtaArrepentido postArrepentido(ModelArrepentido modelArrepentido) {

        ModelRtaArrepentido Rta = new ModelRtaArrepentido();
        if (modelArrepentido.getCuil() == 0 || modelArrepentido.getCuil() == null){
            Rta.setCodigoResultado("100");
            Rta.setDescripcionResultado("Cuil");
            return (Rta);
        }
        else if (modelArrepentido.getIdProducto() == "" || modelArrepentido.getIdProducto() == null){
            Rta.setCodigoResultado("100");
            Rta.setDescripcionResultado("ID Producto");
            return (Rta);
        }
        if ("AC".equals(modelArrepentido.getIdProducto().substring(0, 2))){
            Rta.setDescripcion("Caja de Ahorro ");
        }else if ("CC".equals(modelArrepentido.getIdProducto().substring(0, 2))){
            Rta.setDescripcion("Cuenta Corriente ");
        }else if ("PR".equals(modelArrepentido.getIdProducto().substring(0, 2))){
            Rta.setDescripcion("Prestamo ");
        }else if ("PF".equals(modelArrepentido.getIdProducto().substring(0, 2))){
            Rta.setDescripcion("PLazo Fijo ");
        }else{
            Rta.setDescripcion("Producto desconocido");
        }
        Rta.setTimeStamp(2021042219);
        Rta.setCodigoResultado("000");
        Rta.setDescripcionResultado("OK");
        Rta.setNroTramite(1);
        Rta.setCostos("$1.000");

        return (Rta);
    }
}
