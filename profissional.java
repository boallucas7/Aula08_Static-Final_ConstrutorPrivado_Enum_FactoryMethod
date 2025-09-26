public abstract class profissional {

    public abstract int getSalario();
    public abstract void tipoDeContrato();
    public abstract void fazServico();

    public static profissional CriaProfissional(listaDeProfissionais tipo){
        switch (tipo){
            case EngenheiroCivil:
                return new engenheiro(engenheiros.Civil);
            case EngenheiroMecanico:
                return new engenheiro(engenheiros.Mecanico);
            case EngenheiroDeDados:
                return new engenheiro(engenheiros.Dados);
            case EngenheiroEletricista:
                return new engenheiro(engenheiros.Eletricista);
            case ProgramadorBackEnd:
                return new backEnd();
            case ProgramadorFrontEnd:
                return new frontEnd();
        }
        return null;
    }

}
