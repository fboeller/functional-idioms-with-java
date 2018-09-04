interface Animal {
    void eat();
}

interface Bird extends Animal {
    void fly();
}

interface Reptile extends Animal {
    void walk();
}

class Dog implements Reptile {
    void eat() { /* ... */ }
    void walk() { /* ... */ }
}
