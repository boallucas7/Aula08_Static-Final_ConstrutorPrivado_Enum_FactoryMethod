public final class engenheiro extends profissional {

    private engenheiros especialidades;
    private int salario;
    engenheiro(engenheiros especialidades){
        this.especialidades = especialidades;

        switch (especialidades) {

            case Civil: this.salario = 2500; break;
            case Mecanico: this.salario = 3000; break;
            case Eletricista: this.salario = 3500; break;
            case Dados: this.salario = 4000; break;
            default: this.salario = 2000; break;
        }
    }


    @Override
    public int getSalario() {
        return this.salario;
    }

    @Override
    public void tipoDeContrato() {
        System.out.println("CLT");
    }

    @Override
    public void fazServico() {
        switch (especialidades) {
            case Mecanico:
                System.out.println("Fazendo projeto mecânico.");
            case Eletricista:
                System.out.println("Fazendo projeto elétrico.");
            case Dados:
                System.out.println("Fazendo projeto de dados.");
            case Civil:
                System.out.println("Fazendo projeto de casa.");
            Default:
                System.out.println("Fazendo projeto.");
        }
    }

    public engenheiros getEspecialidade() {
        return this.especialidades;
    }

    public void MostrarEspecialidade() {
        System.out.println("Especialidade: " + especialidades);
    }

}
