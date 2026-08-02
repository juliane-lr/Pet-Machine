public class PetMachine {

    private boolean clean = true;

    private int water = 30;

    private int shampoo = 10;

    private Pet pet = null;



    //Definindo os métodos:
    public void takeShower(){
        if (this.pet == null){
            System.out.println("Coloque o pet na máquina para iniciar o banho.");
            return;
        }

        //Cada banho consome 10 litros de água e 2 litros de shampoo.
        this.water -= 10;
        this.shampoo -= 2;

        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " está limpo!");
    }

    public void addWater(){
        if (water == 30){
            System.out.println("A máquina está com a capacidade máxima de água.");
        }
        else if (water == 29){
            water +=1;
        }
        else water+= 2;
    }

    public void addShampoo(){
        if (shampoo == 10){
            System.out.println("A máquina está com a capacidade máxima de shampoo.");
        }
        else if (shampoo == 9){
            shampoo += 1;
        }
        else shampoo+= 2;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    //Método para saber se já tem pet na máquina
    public boolean hasPet() {
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean){
            System.out.println("A máquina está suja, é necessário limpá-la.");
            return;
        }

        //A máquina só pode ter um pet por vez, então se já tiver um pet, não é possível colocar outro.
        if (hasPet()) {
            System.out.println("O pet " + this.pet.getName() + " está na máquina nesse momento.");
            return; 
        }
        this.pet = pet;
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina.");
    }


    public void removePet() {
        this.clean = this.pet.isClean();
        
        System.out.println("O pet " + pet.getName() + " removido da máquina.");
        
        this.pet = null;
    }

    public void washMachine() {
        this.water -= 3;
        this.shampoo -= 1;
        this.clean = true;
        System.out.println("A máquina foi lavada e está pronta para uso.");
    }

}

