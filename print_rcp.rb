def print_receipt
    @items.each do |item|
      puts "#{item.name.ljust(@@WIDTH1)}" + 
        "#{item.price.truncate(2).to_s("F").rjust(@@WIDTH2)}"
    end
    puts "".ljust(@@WIDTH1 + @@WIDTH2, "=")
    puts "#{"Total".ljust(@@WIDTH1)}" + 
      "#{base.truncate(2).to_s("F").rjust(@@WIDTH2)}"
    puts "#{"Tax".ljust(@@WIDTH1)}#{tax.truncate(2)
    	.to_s("F").rjust(@@WIDTH2)}"
    puts "".ljust(@@WIDTH1 + @@WIDTH2, "=")
    puts "#{"Grand Total".ljust(@@WIDTH1)}" + 
      "#{total_cost.truncate(2).to_s("F").rjust(@@WIDTH2)}"
  end