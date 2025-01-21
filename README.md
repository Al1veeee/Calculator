## 1. Описание проекта:

  *Это простое Android-приложение, которое выполняет основные арифметические операции (сложение, вычитание, умножение и деление) над двумя числами, введенными пользователем. Приложение также предоставляет кнопку для очистки полей ввода и результата.*

## 2. Функциональность:

  •  **Ввод чисел:** *Пользователь может ввести два числа в соответствующие поля ввода (EditText).*

  •  **Арифметические операции:** *Приложение выполняет следующие операции:*
  
   *  *Сложение (+)*
     
   *  *Вычитание (-)*
     
   *  *Умножение (×)*
     
   *  *Деление (/)*

  •  **Вывод результата:** *Результат вычисления отображается в специальном поле (TextView).*

  
  •  **Очистка полей:** *Кнопка ***"Очистить"*** очищает оба поля ввода и поле результата, возвращая их в исходное состояние.*


  • **Обработка ошибок:** *Приложение обрабатывает следующие ошибки*

  
   *  Попытку выполнения математической операции с пустыми значениями в полях ввода

  
   *  Попытку деления на ноль




## 3. Структура проекта:

  •  **MainActivity.java:** *Основной класс активности, содержащий всю логику приложения.*

  
  •  **activity_main.xml:** *XML-файл, описывающий пользовательский интерфейс приложения (разметка).*

  
  •  **strings.xml:** *XML-файл для хранения текстовых ресурсов (строк), которые используются в приложении.*

  
  • **build.gradle:** *Файлы настройки проекта.*

  

## 4. Детальное описание кода:

   * **MainActivity.java:**

  
   *  **onCreate(Bundle savedInstanceState):** *Этот метод вызывается при создании активности. Он инициализирует пользовательский интерфейс, связывает view элементы с переменными, и устанавливает слушатели событий на кнопки.*

     
   *  **Связывание UI:** *Используются методы findViewById() для связывания переменных с элементами UI из файла activity_main.xml.*

     
   *  **editTextText:** *Поле для ввода первого числа.*

     
   * **editTextText2:** *Поле для ввода второго числа.*

    
 *  **resultTextView:** *Поле для вывода результата.*
    
       
    *  **buttonPlus:** *Кнопка сложения.*
       
    *  **buttonMinus:** *Кнопка вычитания.*
       
    *   **buttonMultiply:** *Кнопка умножения.*

    *   **buttonDivide:** *Кнопка деления.*
  
    *  **buttonClear:** *Кнопка очистки.*
  
       
    * **Установка слушателей:** *Для каждой кнопки устанавливается OnClickListener для обработки нажатий.*
  
   
*  **calculate(String operation):** *Метод для выполнения математических операций и вывода результата.*
  
      
     *  *Получает числа из полей ввода и преобразует их в тип float.*
  
       
     *  *Проверяет поля на пустоту и выводит сообщение, если поле пустое.*
  
       
     *  *Выполняет выбранную операцию (+, -, , /) в зависимости от значения параметра operation.*


     *  *Проверяет, не является ли делитель нулём, и, если да, выводит сообщение об ошибке.*
  
       
     *  *Выводит результат вычислений в resultTextView.*

  *  **activity_main.xml:**
  
     *  *Содержит разметку для всех элементов пользовательского интерфейса: EditText, TextView, Button.*
  
     *  *У EditText указаны inputType="numberDecimal" для отображения корректной клавиатуры.*
  
     *  *Используется LinearLayout для расположения элементов.*

## 6. Инструкция по использованию:

  1. **Запуск приложения:** Запустите приложение "Калькулятор" на своем Android-устройстве или эмуляторе.

  2. **Ввод чисел:** Введите числа в поля ввода EditText. Используйте клавиатуру для ввода чисел. Для ввода десятичной части используйте запятую (на некоторых клавиатурах она может отображаться как точка).

  3. **Выбор операции:** Нажмите на нужную кнопку математической операции (+, -, *, /).

  4. **Просмотр результата:** Результат вычислений будет показан в поле TextView под полем ввода.

  5. **Очистка полей:** Нажмите на кнопку "Очистить" для сброса полей ввода и поля результата.

  6. **Обработка ошибок:** В случае ошибки (пустые поля или деление на ноль) будет показано сообщение об ошибке.

## 7. Технологии:

  •  **Язык программирования:** *Java*

  
  •  **Платформа:** *Android*

  
  •  **Среда разработки:** *Android Studio*

## 8. Скриншоты

![image](https://github.com/user-attachments/assets/0192ce2e-9650-40dc-91e3-948dc7716c96)


