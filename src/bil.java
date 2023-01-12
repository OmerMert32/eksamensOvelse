public class bil {
    int vægt;
    trailer trailer;

    public bil(int vægt, trailer trailer){
        this.vægt = vægt;
        this.trailer = trailer;
    }

    public static int totalvægt(bil bil){
        if (bil.vægt + bil.trailer.vægt <= 3500) {
            return bil.vægt + bil.trailer.vægt;
        }
        return 0;
    }
    public String toString(){
        return "bil vægt: " + vægt;
    }
}
