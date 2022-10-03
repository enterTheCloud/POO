public class Tablero {
    private String material;
    private Casillero[][] casilleros = new Casillero[8][8];

    public Tablero(String material){
        this.material = material;
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                Casillero nuevoCasillero = new Casillero();
                nuevoCasillero.setPosicion(Ajedrez.calcularPosicion(i,j));
                if ((i % 2) == (j % 2)) {
                    nuevoCasillero.setColor("Negro");
                } else {
                    nuevoCasillero.setColor("Blanco");
                }
                this.casilleros[i][j] = nuevoCasillero;
            }
        }
    }

    public String getMaterial(){
        return this.material;
    }

    public Casillero[][] getCasilleros() {
        return this.casilleros;
    }
}
