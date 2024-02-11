package Pilha;

public class Pilha {
    private Elemento topo;
    
    public void empilhar(String info){
        if(this.topo == null){
            this.topo = new Elemento(info);
        }else{
            Elemento e = this.topo;
            this.topo = new Elemento(info);
            this.topo.setProximo(e);
        }
    }
    
    public void empilharChar(char c){
        if(this.topo == null){
            this.topo = new Elemento(c);
        }else{
            Elemento e = this.topo;
            this.topo = new Elemento(c);
            this.topo.setProximo(e);
        }
    }
    
    public String desempilhar(){
        if (this.topo == null){
            return null;
        }else{
            Elemento e = this.topo;
            this.topo = e.getProximo();
            return e.getInfo();
        }
    }
    
    public char desempilharChar(){
        if (this.topo == null){
            return ' ';
        }else{
            Elemento e = this.topo;
            this.topo = e.getProximo();
            return e.getC();
        }
    }
    
    public void listar(){
        if (this.topo != null){
            Elemento e = this.topo;
            System.out.println(e.getInfo());
            while(e.getProximo() != null){
                e = e.getProximo();
                System.out.println(e.getInfo());
            }
        }
    }
    
    public int tamanho(){
        if(this.topo == null){
            return 0;
        }else{
            int c = 1;
            Elemento e = this.topo;
            while(e.getProximo() != null){
                c ++;
                e = e.getProximo();
            }
            return c;
        }
    }
    
    public boolean vazia(){
        if (this.topo == null){
            return true;
        }else{
            return false;
        }
    }
    
    public char topo(){
        if (this.topo == null){
            return ' ';
        }else{
            return this.topo.getC();
        }
    }
}
