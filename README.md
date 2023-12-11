# SE_Refactoring

# گزارش آزمایش:

بازآرایی Facade - مورد اول:
از CodeGenerator در Parser مستقیما استفاده می‌شود و برای کاهش این پیچیدگی، کلاسی با نام CodeGeneratorFacade  اضافه می‌کنیم که توابع مورداستفاده کلاینت را در آن پیاده‌سازی می‌شوند. سپس در این توابع، توابع خود CodeGenerator صدا زده می‌شوند.

<img width="542" alt="1" src="https://github.com/epMahdiyeh/SE_Refactoring/assets/62205305/46c102a3-db47-4feb-8b5c-f937d26250f8">


بازآرایی Facade - مورد دوم:

مشابه مورد اول، در این بازآرایی نیز کلاسی به نام MemoryFacade طراحی می‌کنیم که در آن SymbolTable مستقیما از Memory استفاده نکند و واسطی داشته باشد.

<img width="532" alt="2" src="https://github.com/epMahdiyeh/SE_Refactoring/assets/62205305/7a0b25a2-5e70-4d69-85bd-1acb9596d0d9">

بازآرایی استفاده از Polymorphism به جای شرط:

در این بازآرایی، به جای استفاده از ساختار switch-case، هر مورد را به یک کلاس جدید متناظر با همان case تبدیل می‌کنیم. برای این کار، enum طراحی شده مربوط به TypeAddress را به interface تبدیل کرده و تغییرات لازم را بصورت زیر اجرا می‌کنیم:



