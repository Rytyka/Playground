# Playground
## Dependency Injection
### Single Implementation Injection
* Either by providing a Guice module (which extends the Abstract module) by overriding the `configure()` function with a binding, e.g.
`bind(Discountable.class).to(NightOwlDiscount.class);`
* Or by specifying which implementation should be used on the interface by using `@ImplementedBy` , e.g.
`@ImplementedBy(EarlyBirdDiscount.class)`

Injectable classes must have either one (and only one) constructor annotated with @Inject or a zero-argument constructor that is not private.

### Implicit Provider
* Instantiating each implementation of the interface can be expensive. Providers allow us to do lazy instantiation at runtime for only the requested implementation. 
We do this by injecting the provider instead of the implementation, e.g.

 
       @Inject
       public CheckoutService(Provider<Discountable> provider){         
           this.provider = provider;
       }
* To call the method of the implementation, you have to go through the factory by calling the `get()` method, e.g. `int discount = provider.get().getDiscount();`

        
### Explicit Provider
* For doing conditional injection, we can provide our own `get()` method implementation to the Provider, e.g.
        
        public class ProviderClass implements Provider<Discountable> {
            @Override
            public Discountable get() {
            ...
            }
        }
 
*  This Provider is bound to the interface in the Guice module, e.g. `bind(Discountable.class).toProvider(ProviderClass.class);`

