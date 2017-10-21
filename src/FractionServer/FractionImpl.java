package FractionServer;
import FractionIDL.*;
import com.softmoore.math.Fraction;

public class FractionImpl extends FractionPOA{
    private static String toString(FractionRep fr)
    {
        return fr.numerator+"/"+fr.denominator;
    }
    @Override
    public FractionRep add(FractionRep lhs, FractionRep rhs){
        com.softmoore.math.Fraction f = new Fraction(lhs.numerator,lhs.denominator);
        Fraction res = f.add(new Fraction(rhs.numerator,rhs.denominator));
        FractionRep rep = new FractionRep(res.getNumerator(),res.getDenominator());
        System.out.println(toString(lhs)+" + "+toString(rhs)+" = "+toString(rep));
        return rep;
    }
}
