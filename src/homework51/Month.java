package homework51;

public enum Month { // enumeration - перечисление
  JANUARY("Январь"), // происходит вызов конструктора
  FEBRUARY("Февраль"),
  MARCH("Март"),
  APRIL("Апрель"),
  MAY("Май"),
  JUNE("Июнь"),
  JULY("Июль"),
  AUGUST("Август"),
  SEPTEMBER("Сентябрь"),
  OCTOBER("Октябрь"),
  NOVEMBER("Ноябрь"),
  DECEMBER("Декабрь");

  // в enum можно добавлять обычные поля и методы, как в любой другой класс
  private final String name;

  // При описании конструктора его нужно "вызвать" в описании каждого значения (см. выше).
  // Конструктор enum по умолчанию private.
  /*private*/ Month(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}