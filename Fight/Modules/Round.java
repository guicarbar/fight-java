package Fight.Modules;

public class Round extends Fight{
    // atributos pra analise player
    boolean defesaP;
    boolean empurrarP;
    int danoP;

    // atributos para analise enemy

    boolean defesaE;
    boolean empurrarE;
    int danoE;


    // construtor/super
    public Round(boolean defesaP, boolean empurrarP, int danoP, Fighter player, boolean defesaE, boolean empurrarE, int danoE, Enemy enemy) {
        super(player, enemy);
        // player
        this.defesaP = defesaP;
        this.empurrarP = empurrarE;
        this.danoP = danoP;

        // enemy
        this.defesaE = defesaE;
        this.empurrarE = empurrarE;
        this.danoE = danoE;
    }


    //
}