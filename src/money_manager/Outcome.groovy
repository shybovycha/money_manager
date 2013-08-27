package money_manager

class Outcome extends Transaction
{
	Outcome(n)
	{
		amount = (n > 0) ? -n : n
	}
}
