public class Maquina {

    private boolean clean;

    private int water;

    private int shampoo;

    private Pet pet;

    public void tomarBanho() {
        if (this.pet == null) {
            System.out.println("O Pet deve estar na máquina para iniciar o banho");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getNome() + "está limpo");
    }

    public void adicionarAgua() {
        if(water == 30) {
            System.out.println("A máquina está com a capacidade máxima de água");
            return;
        }

        water =+ 2;

    }

    public void adicionarShampoo() {
        if(shampoo == 10) {
            System.out.println("A máquina está com a capacidade máxima de shampoo");
            return;
        }

        water =+ 2;

    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean temPet(
        return pet != null;
    )

    public void setPet(Pet pet) {
        if (!this.clean) {
            System.out.println("A máquina está suja, limpe-a para colocar o pet");
            return;
        }
        if (temPet()) {
            System.out.println("O pet " + this.pet.getNome() + " está na máquina nesse momento");
            return;
        }

        this.pet = pet;
    }

    public void removerPet() {
        if this.clean = this.pet.isClean();
        System.out.println("O pet " + this.pet.getNome() + " está limpo");
        this.pet = null;
    }

    public void limparMaquina () {
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;

        System.out.println("A máquina está limpa");
    }
}