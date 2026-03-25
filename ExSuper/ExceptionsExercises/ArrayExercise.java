package ExceptionsExercises;

public class ArrayExercise {
    static int [] arrayInteiros = {1,2,3,4,5,6,7,8,9,10};
    //declarando array inteiros
    
    public int acessarElemento(int[]array, int i){
        //metodo acessar elemento com tratamento de excecao)
        try{ 
            return array[i];
        }

        catch (ArrayIndexOutOfBoundsException ae){
            // variavel ae armazena a exception
            System.out.println("indice nao previsto");
            }
        
        finally{System.out.println("Finalizado");}
        return -1;
        // -1 e valor int que por convencao demonstra erro
    }

        public static void main(String[] args) {

            ArrayExercise array1 = new ArrayExercise();
            System.out.println(array1.acessarElemento(arrayInteiros, 15));
        }
    }
