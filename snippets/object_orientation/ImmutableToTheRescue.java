public static void keepCareOfMyAccount(BankAccount account) { /* ... */ }

BankAccount account = new BankAccount(0).addSavings(100);
keepCareOfMyAccount(account);
// Account will still have 100 euros
