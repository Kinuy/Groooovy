class SupermarketApp {

  static void main(String[] args) {
    def inventory = new Inventory()
    def sales = new Sales()
    def supplierManager = new SupplierManager()

    // Example interaction
    def prod1 = new Product(name: "Milk", price: 1.99, sku: "M001", category: "Dairy", stock: 10)
    def prod2 = new Product(name: "Eggs", price: 2.99, sku: "E001", category: "Dairy", stock: 20)

    inventory.addProduct(prod1)
    inventory.addProduct(prod2)

    inventory.viewProducts()
    inventory.checkStockLevels()

    sales.recordSale("M001", 2, inventory)
    sales.generateReport()

    def supplier = new Supplier(name: "DairyFarm", suppliedProducts: ["M001", "E001"])
    supplierManager.addSupplier(supplier)
    supplierManager.viewSuppliers()
  }
}
