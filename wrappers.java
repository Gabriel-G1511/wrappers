public class wrappers {
    public static void main(String[] args) {


                int anos = 26;
                System.out.println("olá, meu nome é gabriel e tenho " + anos + " anos");

                Integer anosWrapper = Integer.valueOf(anos); // conversão explícita

                System.out.println("valor wrapper: " + anosWrapper);
            }
        }