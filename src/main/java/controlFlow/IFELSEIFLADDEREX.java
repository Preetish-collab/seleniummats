package controlFlow;

public class IFELSEIFLADDEREX {
    public static void main(String[] args) {
        String city="Rourkela";
        if(city=="Bhubaneswar"){
            System.out.println("Capital of Odisha");
        }
        else if(city=="Cuttack"){
            System.out.println("Millennium City");
        }
        else if(city=="Rourkela"){
            System.out.println("Steel City");
        }
        else if(city=="Puri"){
            System.out.println("Temple City");
        }
        else{
            System.out.println("City not found");
        }
    }
}
