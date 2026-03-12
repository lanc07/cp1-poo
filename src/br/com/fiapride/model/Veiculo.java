package br.com.fiapride.model;

//  aplicando encapsulamento
public class Veiculo {

    private String dono;
    private String pl;
    private double gas;

    public  Veiculo( String dono, String pl) {
        this.setDono(dono);
        this.setPl(pl);
        this.setGas(0);
    }
//  getters e setters
        public void adicionar(double v){
            gas = gas + v;
        }
        public void gasta (double v){
            this.setGas(this.getGas() - v);
            if (v > gas){
                System.out.println("gastou toda a gasolina :/");
            }
        }
        public String getDono() {
            return this.dono;
        }
        public String getPl () {
            return this.pl;
        }
        private void setDono(String dono){
            this.dono = dono;
        }
        private void setPl (String pl){
            this.pl = pl;
        }
        private void setGas( double gas){
           this.gas = gas;
           if (this.gas <= 0) {
               this.gas = 0;
           }
        }

        public double getGas() {
            return this.gas;
        }
    }
