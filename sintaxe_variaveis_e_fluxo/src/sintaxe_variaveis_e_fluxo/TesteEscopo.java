package sintaxe_variaveis_e_fluxo;

public class TesteEscopo {

    public static void main(String[] args){
        System.out.println("testando condicionais");

        int idade = 20;
        int quantidadePessoas = 3;    
        //boolean acompanhado = true;

        if (quantidadePessoas >= 2) {
        }else {
        }

        boolean acompanhado = false;	
		if (idade >=18 || acompanhado){

            System.out.println("Seja bem vindo"); 
        } else {
            System.out.println("infelizmente voce nao pode entrar");
    }

}
}
