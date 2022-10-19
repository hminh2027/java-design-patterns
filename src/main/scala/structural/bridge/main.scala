package structural.bridge

case class main() {
  val vcb_credit = new VietcomBank(new CreditCard)
  val tcb_debit = new TechcomBank(new DebitCard)
  val tcb_prepaid = new TechcomBank(new PrepaidCard)

  vcb_credit.openCard()
  tcb_debit.openCard()
  tcb_prepaid.openCard()
}
