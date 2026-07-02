package Model.Animais;

import Model.Funcionarios.Veterinario;

public class FichaMedica{
    private String vacinas;
    private String alergias;
    private Veterinario veterinario;

    public FichaMedica(String vacinas, String alergias, Veterinario veterinario) {
        this.vacinas = vacinas;
        this.alergias = alergias;
        this.veterinario = veterinario;
    }

    public String getVacinas() {
        return vacinas;
    }

    public String getAlergias() {
        return alergias;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

}
