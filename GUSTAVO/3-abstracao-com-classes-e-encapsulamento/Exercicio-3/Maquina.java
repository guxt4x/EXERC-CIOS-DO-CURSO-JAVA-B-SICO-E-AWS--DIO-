public class Maquina {
    private boolean clean;
    private int water;
    private int shampoo;
    private Pet pet;

    public Maquina() {
        this.clean = true;
        this.water = 0;
        this.shampoo = 0;
        this.pet = null;
    }

    public void tomarBanho() {
        if (this.pet == null) {
            System.out.println("O pet deve estar na máquina para iniciar o banho");
            return;
        }
        
        if (this.water < 10) {
            System.out.println("Água insuficiente! Necessário 10 litros. Atual: " + this.water);
            return;
        }
        
        if (this.shampoo < 2) {
            System.out.println("Shampoo insuficiente! Necessário 2 litros. Atual: " + this.shampoo);
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getNome() + " está limpo!");
    }

    public void adicionarAgua() {
        if (water >= 30) {
            System.out.println("A máquina está com a capacidade máxima de água");
            return;
        }
        
        if (water + 2 > 30) {
            water = 30;
            System.out.println("Água adicionada! Capacidade máxima atingida: 30 litros");
        } else {
            water += 2;
            System.out.println("2 litros de água adicionados. Total: " + water + " litros");
        }
    }

    public void adicionarShampoo() {
        if (shampoo >= 10) {
            System.out.println("A máquina está com a capacidade máxima de shampoo");
            return;
        }
        
        if (shampoo + 2 > 10) {
            shampoo = 10;
            System.out.println("Shampoo adicionado! Capacidade máxima atingida: 10 litros");
        } else {
            shampoo += 2;
            System.out.println("2 litros de shampoo adicionados. Total: " + shampoo + " litros");
        }
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean temPet() {
        return pet != null;
    }

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
        System.out.println("Pet " + pet.getNome() + " colocado na máquina");
    }

    public void removerPet() {
        if (this.pet == null) {
            System.out.println("Não há pet na máquina");
            return;
        }
        
        this.clean = this.pet.isClean();
        
        if (this.pet.isClean()) {
            System.out.println("O pet " + this.pet.getNome() + " foi retirado limpo!");
        } else {
            System.out.println("O pet " + this.pet.getNome() + " foi retirado sujo. Máquina precisa de limpeza!");
        }
        
        this.pet = null;
    }

    public void limparMaquina() {
        if (this.clean) {
            System.out.println("A máquina já está limpa");
            return;
        }
        
        if (this.water < 3) {
            System.out.println("Água insuficiente para limpeza! Necessário 3 litros. Atual: " + this.water);
            return;
        }
        
        if (this.shampoo < 1) {
            System.out.println("Shampoo insuficiente para limpeza! Necessário 1 litro. Atual: " + this.shampoo);
            return;
        }

        this.water -= 3;
        this.shampoo -= 1;
        this.clean = true;

        System.out.println("A máquina está limpa!");
    }
}