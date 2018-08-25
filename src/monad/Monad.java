import java.util.function.Function;

public interface Monad<A> {

    interface Pack<B> {
	Monad<B> apply(B b);
    }
    
    <B> Monad<B> flatMap(Function<A, Monad<B>> f);

    default <B> Monad<B> map(Pack<B> pack, Function<A, B> f) {
	return flatMap(a -> pack.apply(f.apply(a)));
    }

}
