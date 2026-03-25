package ExceptionsExercises;

public class ExemploNullPointerExceptionInteger {
    Integer number = null;

    public Integer getNumber(){
        return number;
    }
   

    public static void main(String[] args) {
        try{
            ExemploNullPointerExceptionInteger obj = new ExemploNullPointerExceptionInteger();
            System.out.println((obj.getNumber()).toString());
        }catch(NullPointerException e){
            System.out.println("Number = null");
        }finally{
            System.out.println("Finish execution");
        }
        
    }
}
