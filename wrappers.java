public class wrappers {
    public static void main(String[] args) {


        int anos = 26;
        System.out.println("olá, meu nome é gabriel e tenho " + anos + " anos");

        Integer anosWrapper = anos; // autoboxing
        anosWrapper = 27;

        int anosDeNovo = anosWrapper; // unboxing

        System.out.println("agora irei fazer " + anosDeNovo + " anos em novembro");

    }
}
//