public class Avaliacao {
    private float p1;
    private float p2;
    private float p3;
    private float listaDeExercícios;
    private float seminário;
    protected float médiaFinal;

    public void setAvaliacao(float p1, float p2, float p3, float listaDeExercícios, float seminário){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.listaDeExercícios = listaDeExercícios;
        this.seminário = seminário;
    }
    public float getP1(){
        return p1;
    }
    public float getP2(){
        return p2;
    }
    public float getP3(){
        return p3;
    }
    public float getListaDeExercícios(){
        return listaDeExercícios;
    }
    public float getSeminário(){
        return seminário;
    }

    public void médiaFinalA(){
        médiaFinal = (p1+p2+p3+listaDeExercícios+seminário)/5;
    }
    public void médiaFinalB(){
        médiaFinal = (p1+p2*2+p3*3+listaDeExercícios+seminário)/8;
    }    
}
