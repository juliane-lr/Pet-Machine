import java.util.Scanner;

public class main{

    private final static Scanner scanner = new java.util.Scanner(System.in);
    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        scanner.useDelimiter("\n");
        int option;

        do {
            System.out.println("===Escolha uma das opções abaixo===");
            System.out.println("1. Dar banho no pet");
            System.out.println("2. Abastecer a máquina com água");
            System.out.println("3. Abastecer a máquina com shampoo");
            System.out.println("4. Verificar água na máquina");
            System.out.println("5. Verificar shampoo na máquina");
            System.out.println("6. Verificar se tem pet na máquina");
            System.out.println("7. Colocar pet na máquina");
            System.out.println("8. Retirar pet da máquina");
            System.out.println("9. Limpar a máquina");
            System.out.println("0. Sair");

            option = scanner.nextInt();

            switch (option){
                case 1 -> petMachine.takeShower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPet();
                case 7 -> setPetInMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.washMachine();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida.");
            }

        } while (true);
    }

    private static void setWater(){
        System.out.println("Colocando água na máquina...");
        petMachine.addWater();
    }

    private static void setShampoo(){
        System.out.println("Colocando shampoo na máquina...");
        petMachine.addShampoo();
    }

    private static void verifyWater() {
        var amount = petMachine.getWater();
        System.out.println("A máquina está com " + amount + " litros de água.");
    }

    private static void verifyShampoo() {
        var amount = petMachine.getShampoo();
        System.out.println("A máquina está com " + amount + " litros de shampoo.");
    }

    public static void setPetInMachine() {
        var name = "";
        while (name == null || name.isEmpty()){
            System.out.println("Digite o nome do pet: ");
            name = scanner.next();
        }
        
        var pet = new Pet(name);
        petMachine.setPet(pet);
        
    }

    private static void checkIfHasPet(){
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na máquina." : "Não tem pet na máquina.");
    }

}
