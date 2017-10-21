package FractionServer;
import FractionIDL.*;
import com.softmoore.math.Fraction;

public class FractionImpl extends FractionPOA{
    @Override
    public FractionRep add(FractionRep lhs, FractionRep rhs){
        com.softmoore.math.Fraction f = new Fraction(lhs.numerator,lhs.denominator);
        f.add(new Fraction(rhs.numerator,rhs.denominator));
        return new FractionRep(f.getNumerator(),f.getDenominator());
    }
}
