public interface IBaseRate {

    //write methods that return base rate 
    default double getBaseRate(){
        return 2.5;
    }
}