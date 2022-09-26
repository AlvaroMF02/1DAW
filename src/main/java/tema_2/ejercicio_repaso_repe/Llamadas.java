package tema_2.ejercicio_repaso_repe;

import java.time.LocalDateTime;

/**
 *
 * @author alvaro
 */
public class Llamadas {

    private String id;
    private String numOrigen;
    private String numDestino;
    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFin;

    public Llamadas() {
    }

    
    
    //alea
    public Llamadas(String id, String numOrigen, String numDestino, LocalDateTime fechaHoraInicio, LocalDateTime fechaHoraFin) {
        this.id = id;
        this.numOrigen = numOrigen;
        this.numDestino = numDestino;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumOrigen() {
        return numOrigen;
    }

    public void setNumOrigen(String numOrigen) {
        this.numOrigen = numOrigen;
    }

    public String getNumDestino() {
        return numDestino;
    }

    public void setNumDestino(String numDestino) {
        this.numDestino = numDestino;
    }

    public LocalDateTime getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(LocalDateTime fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public LocalDateTime getFechaHoraFin() {
        return fechaHoraFin;
    }

    public void setFechaHoraFin(LocalDateTime fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }

    //METODO PARA CALCULAR LA DURACION DE LAS LLAMADAS
    public int calcularTiempo(LocalDateTime fechaHoraInicio, LocalDateTime fechaHoraFin) {
        int tiempoLlamada = 0;

        fechaHoraInicio.compareTo(fechaHoraFin);

        return tiempoLlamada;
    }

    @Override
    public String toString() {
        return "llamadas{" + "id=" + id + ", numOrigen=" + numOrigen + ", numDestino=" + numDestino + ", fechaHoraInicio=" + fechaHoraInicio + ", fechaHoraFin=" + fechaHoraFin + '}';
    }

}
