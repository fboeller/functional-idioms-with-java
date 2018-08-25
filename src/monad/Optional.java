import java.util.function.Function;

public class Optional<A> {

    private final A a;

    private Optional(A a) {
	this.a = a;
    }
    
    public static <B> Optional<B> zero() {
	return new Optional<>(null);
    }
    
    public Optional<A> plus(Optional<A> other) {
        if (this.a == null) {
	    return other;
	} else {
	    return this;
	}
    }

    public static <B> Optional<B> pack(B b) {
	return new Optional<>(b);
    }
    
    <B> Optional<B> flatMap(Function<A, Optional<B>> f) {
	if (this.a == null) {
	    return zero();
	} else {
	    return f.apply(this.a);
	}
    }

}
