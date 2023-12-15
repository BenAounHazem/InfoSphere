public class calculatrice2 {
    package main;
public class Calculatrice2 {
public int sommerDeuxEntiers(int a, int b) {
return a+b;
}
public int multiplierDeuxEntiers(int a, int b) {
return a*b;
}
public void calculLent() {
try {
// Attendre
Thread.sleep(1000);
} catch (InterruptedException e) {
e.printStackTrace();
}
}
}
}
