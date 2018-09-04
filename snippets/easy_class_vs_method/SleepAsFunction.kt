sealed class Animal {
    sealed class Bird : Animal() {
        class Wellensittich : Bird()
    }
    sealed class Reptile : Animal() {
        class Dog : Reptile()
        class Cat : Reptile()
    }
}

fun sleep(animal: Animal) = when(animal) {
    is Animal.Bird -> 1
    is Animal.Reptile.Dog -> 2
    is Animal.Reptile.Cat -> 3
}
