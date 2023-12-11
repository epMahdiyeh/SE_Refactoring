# SE_Refactoring

# گزارش آزمایش:

بازآرایی Facade - مورد اول:
از CodeGenerator در Parser مستقیما استفاده می‌شود و برای کاهش این پیچیدگی، کلاسی با نام CodeGeneratorFacade  اضافه می‌کنیم که توابع مورداستفاده کلاینت را در آن پیاده‌سازی می‌شوند. سپس در این توابع، توابع خود CodeGenerator صدا زده می‌شوند.

<img width="542" alt="1" src="https://github.com/epMahdiyeh/SE_Refactoring/assets/62205305/46c102a3-db47-4feb-8b5c-f937d26250f8">

[CodeGenerator Facade](https://github.com/epMahdiyeh/SE_Refactoring/commit/e12be4107be9681fe14709f72b6ec54e3930921a)

بازآرایی Facade - مورد دوم:

مشابه مورد اول، در این بازآرایی نیز کلاسی به نام MemoryFacade طراحی می‌کنیم که در آن SymbolTable مستقیما از Memory استفاده نکند و واسطی داشته باشد.

<img width="532" alt="2" src="https://github.com/epMahdiyeh/SE_Refactoring/assets/62205305/7a0b25a2-5e70-4d69-85bd-1acb9596d0d9">

[Memory Facade](https://github.com/epMahdiyeh/SE_Refactoring/commit/11a4aadc9e2ec88bf59cfa737bcb996f1644d28a)


بازآرایی استفاده از Polymorphism به جای شرط:

در این بازآرایی، به جای استفاده از ساختار switch-case، هر مورد را به یک کلاس جدید متناظر با همان case تبدیل می‌کنیم. برای این کار، enum طراحی شده مربوط به TypeAddress را به interface تبدیل کرده و تغییرات لازم را بصورت زیر اجرا می‌کنیم:

<img width="654" alt="3" src="https://github.com/epMahdiyeh/SE_Refactoring/assets/62205305/a1fa012a-9ad4-47f2-b0f6-3d3f06a5c7f0">

پیاده‌سازی کلاس DirectAddress:
<img width="394" alt="4" src="https://github.com/epMahdiyeh/SE_Refactoring/assets/62205305/a477777e-204c-4fb1-839a-be5ec626401f">

پیاده‌سازی کلاس ImidiateAddress:

<img width="378" alt="5" src="https://github.com/epMahdiyeh/SE_Refactoring/assets/62205305/34ee9117-5b89-4a0f-9447-f0ece2b7823b">

پیاده‌سازی کلاس IndirectAddress:

<img width="394" alt="6" src="https://github.com/epMahdiyeh/SE_Refactoring/assets/62205305/a0d08611-31c4-4655-9a9f-b322f28efff8">

[Polymorphism](https://github.com/epMahdiyeh/SE_Refactoring/commit/68e5feed892f085022a07c9e27a845f05a0a7b49)


بازآرایی Separate Query from Modifier:

این بازآرایی به اصل CQRS می‌پردازد که مربوط به جداسازی دستورات و کوئری‌ها و وظایف مربوط به آن‌هاست. تفکیک این دستورات و کوئری‌ها به این معنی است که هر کدام می‌توانند در صورت نیاز بهینه شوند. درواقع کدهایی که داده‌ها را دریافت می‌کنند از کدهایی که تغییراتی را در یک Object ایجاد می‌کنند جدا می‌کنیم. در اینجا مقدار بازگشتی تابع getNextParameter را به شرح زیر تغییر میدهیم:

<img width="666" alt="7" src="https://github.com/epMahdiyeh/SE_Refactoring/assets/62205305/110e4c39-66e3-45fc-87fb-91d0c6a6c3d5">

[Separate Query from Modifier](https://github.com/epMahdiyeh/SE_Refactoring/commit/d75c8c4e4132ab391d98912d2f2f3c2bf89f12b5)


بازآرایی Self Encapsulate Field:

در توابع یک کلاس، ممکن است مستقیما از متغیرهای خصوصی موجود در کلاس استفاده شود. گاهی اوقات این دسترسی مستقیم در کلاس انعطاف‌پذیری کافی را برای توسعه بهتر فراهم نمی‌کند. برای مثال در این پروژه lexicalAnalyzer دسترسی مستقیم به متغیر خصوصی matcher وجود دارد که به منظور تغییر این شرایط، متدهای setMatcher و getMatcher را طراحی می‌کنیم تا بجای استفاده مستقیم از matcher بتوانیم از این متدها استفاده کنیم:

<img width="903" alt="8" src="https://github.com/epMahdiyeh/SE_Refactoring/assets/62205305/bb3157a7-398b-436e-98af-26051af20395">

[Self Encapsulate Field](https://github.com/epMahdiyeh/SE_Refactoring/commit/4347a02ae04f1e174314bb62f147a9a94d048375)


بازآرایی Inline Temp:

زمانی که متغیری داشته باشیم که صرفا حاصل یک expression به آن اختصاص داده می‌شود و کارایی دیگری برای متغیر وجود ندارد، می‌توانیم ارجاعات آن متغیر را با خود expression جایگزین کنیم. این مورد در Token و تابع hashCode دیده می‌شود که می‌توان آن را به شکل زیر تغییر داد:

<img width="895" alt="9" src="https://github.com/epMahdiyeh/SE_Refactoring/assets/62205305/45df8711-4963-4652-84a7-7b45b36afd70">

[Inline Temp](https://github.com/epMahdiyeh/SE_Refactoring/commit/381cf51a072c2828d7f57af9d8a77ef6827b7a2b)

بازآرایی Extract Variable:

در این بازآرایی یک متغیر جدید تعریف میکنیم به این منظور که بتوانیم از مقدار آن به جای دسترسی به مقدار برخی توابع استفاده کنیم. این کار به خوانایی کد کمک می‌کند و اگر در آینده نیاز به ایجاد تغییر در این مقدار داشته باشیم، کافیست فقط مقدار متغیر را تغییر دهیم. یک نمونه از این تغییر در کلاس CodeGenerator به صورت زیر مشخص است:


