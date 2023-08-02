package homework51;

public enum Month { // enumeration - перечисление
  JANUARY("Январь",31), // происходит вызов конструктора
  FEBRUARY("Февраль",28),
  MARCH("Март",31),
  APRIL("Апрель",30),
  MAY("Май",31),
  JUNE("Июнь",30),
  JULY("Июль",31),
  AUGUST("Август",30),
  SEPTEMBER("Сентябрь",31),
  OCTOBER("Октябрь",30),
  NOVEMBER("Ноябрь",31),
  DECEMBER("Декабрь",30);

  // в enum можно добавлять обычные поля и методы, как в любой другой класс
  private final String name;
  private final int days;

  Month(String name, int days) {
    this.name = name;
    this.days = days;
  }

  public String getName() {
    return name;
  }

  public int getDays() {
    return days;
  }
}