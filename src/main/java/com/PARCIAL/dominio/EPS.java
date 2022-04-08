package com.PARCIAL.dominio;

import com.dispesadorTaller.dominio.snack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

public class EPS {
    private static final int CAPACIDAD_DE_PACIENTES = 100;
    private List<Paciente> pacientes;
    private List<enfermedad> enfermedades;

    public EPS() {
        this.pacientes = new ArrayList<>();
    }

    public boolean AfiliarPaciente(int cedula, String nombre, enfermedad enfermedad) {
        Paciente PacientePaAgregar = new Paciente(cedula, nombre, enfermedad);
        if (pacientes.size() < CAPACIDAD_DE_PACIENTES) {
            pacientes.add(PacientePaAgregar);
            System.out.println(pacientes);
            return true;
        }
        return false;
    }

    public boolean EliminarPAciente(int cedula) {
        Paciente PacientePAEliminar = BuscarPaciente(cedula);
        if (PacientePAEliminar != null) {
            this.pacientes.remove(PacientePAEliminar);
        }

    }

    public Paciente BuscarPaciente(int cedula) {
        Paciente pacienteABuscar = this.pacientes.stream()
                .filter(n -> n.getCedula() == cedula)
                .findFirst().orElse(null);

        return pacienteABuscar;
    }


    public void BuscarSinenfermedad() {
        Paciente PacienteSinEnfermedad;
        PacienteSinEnfermedad = this.pacientes.stream().filter(e -> e.getEnfermedad() == null).findFirst().orElse();

    }

    public void Ordenar() {
        this.pacientes.sort(Comparator.comparing(Paciente::getNombre).thenComparing(Paciente::getCedula));
        System.out.println(pacientes);

    }


}
