public class Fraction {
  private long numerator;
  private long denumerator;

  public Fraction(){
    this.denumerator = 1;
    this.numerator = 0;
  }

  public Fraction(long numerator, long denumerator){
    this.denumerator = denumerator;
    this.numerator = numerator;
  }

  public Fraction(long denumerator){
    this.denumerator = denumerator;
    this.numerator = 1;
  }
}
