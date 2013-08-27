package money_manager

class Income extends Transaction 
{
	Income(n)
	{
		amount = (n > 0) ? n : -n
	}
}
