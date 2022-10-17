package lampada;

public class Lampada { 
    protected boolean estado = false; 
    private int potencia;
  
    public void  acionarOnOff(){
        estado = !estado;
    }
    public boolean getEstado(){
        return estado;
    }
    public int potencia(){
        return potencia;
    }
    public int verificarPotencia(){
        return potencia;
    }
    public void alterarPotencia (int novaPotencia){
        potencia = novaPotencia;
    }
}

