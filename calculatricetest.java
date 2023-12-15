import java.text.MessageFormat;
import java.time.Duration;
import java.time.Instant;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import main.Calculatrice2;
public class Calculatrice2Test {
private Calculatrice2 c;
private static Instant debut;
@BeforeEach
public void initCalculatrice() {
System.out.println("Appel avant chaque test");
c= new Calculatrice2();
}
@AfterEach
public void nullCalculatrice() {
System.out.println("Appel après chaque test");
c= null;
}
@BeforeAll
static public void init_Temps_Debut () {
System.out.println("Appel apres tous les tests");

debut= Instant.now();
}
@AfterAll
static public void Afficher_Duree_Tests() {
System.out.println("Appel apres tous les tests");
Instant fin= Instant.now();
long duration = Duration.between(debut, fin).toMillis();
System.out.println(MessageFormat.format("Durée des tests :{0} ms", duration));
}
@ParameterizedTest
@ValueSource
(ints= {1,4,1000,5})
public void res_multiplicationParZero_zero(int arg) {

}
@Timeout(1)
@Test
public void testCalculLent() {
// Arrange
// Act
c.calculLent();
// Assert
// ...
}
@Test
public void sommerDeuxEntierstest() {
//Arrange
int a =9;
int b=5;
//Calculatrice2 c= new Calculatrice2();
//ACT
int f=c.sommerDeuxEntiers(a,b);
// Assert
assertEquals(14,f);
//assert(f==5);
c.calculLent();
}
@Test
public void multiplierDeuxEntierstest() {
//Arrange
int a =9;
int b=5;
//Calculatrice2 c= new Calculatrice2();
//ACT
int f=c.multiplierDeuxEntiers(a,b);
// Assert
assertEquals(45,f);
}

}