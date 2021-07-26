package net.petrikainulainen.spring.batch;

import javax.persistence.*;


@Entity
@Table(name = "Transaction" )
public class TransactionDTO {

	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@GeneratedValue(generator = "TRANS_SEQ")
	@SequenceGenerator(name = "TRANS_SEQ", sequenceName = "TRANS_SEQ", initialValue = 1, allocationSize = 1)
	private Long register_identifier;

	@Column(name = "supplier_Product_Code")
	private String supplierProductCode; //2 -3

	@Column(name = "obu_pan")
	private String obu_pan; //4-22

	@Column(name = "tsp_Actor_Id")
	private String tspActorId; //23-28

	@Column(name = "transit_Entry_Time")
	private String transitEntryTime; //34 -47

	@Column(name = "entry_Station_Actor_ID")
	private String entryStationActorID; //50 -55

	@Column(name = "entry_Network_Code")
	private String entryNetworkCode; // 56 -56

	@Column(name = "entry_Terminal_Code")
	private String entryTerminalCode; //57 -60

	@Column(name = "transit_Exit_Time")
	private String transitExitTime; //61-74

	@Column(name = "exit_Station_Actor_ID")
	private String exitStationActorID; //77 -82

	@Column(name = "exit_Network_Code")
	private String exitNetworkCode; //83-83

	@Column(name = "exit_Terminal_Code")
	private String exitTerminalCode; //84-87

	@Column(name = "transaction_Lane")
	private String transactionLane; //88-91

	@Column(name = "transaction_Tariff")
	private String transactionTariff;  //92 -93

	@Column(name = "vehicle_Class")
	private String vehicleClass; //94-94

	@Column(name = "vehicle_Axles")
	private String vehicleAxles; //104-109

	@Column(name = "net_Amount")
	private String netAmount; //115 - 125

	@Column(name = "vat_Amount")
	private String vatAmount; //126 - 136

	@Column(name = "gross_Amount")
	private String grossAmount; // 137-147

	@Column(name = "supplier_Currency")
	private String supplierCurrency; //148 -150

	@Column(name = "product_Code_VAT_Rate")
	private String productCodeVATRate; //151 -154

	@Column(name = "level_Of_Security")
	private String levelOfSecurity;//159-160

	@Column(name = "supplier_Transa_Description")
	private String supplierTransaDescription;

	@Column(name = "vehicle_Plate_Number")
	private String vehiclePlateNumber; //240 -249

	@Column(name = "vehicle_Country")
	private String vehicleCountry; //250 -251

	@Column(name = "validation_NAT_List_Id")
	private String validationNATListId; //264-282

	@Column(name = "vehicle_Fuel_Type")
	private String vehicleFuelType; //293-295

	@Column(name = "vehicle_Euronorm")
	private String vehicleEuronorm; //296-297

	@Column(name = "vehicle_Tariff_Class")
	private String vehicleTariffClass; //298-299

	@Column(name = "context_Mark")
	private String contextMark; //603 -614

	@Column(name = "obe_pan")
	private String obe_pan; //615-632

	@Column(name = "trx_Aggregate_Nbr")
	private String trxAggregateNbr; //652-667

	@Column(name = "utc_Time_Stamp")
	private String utcTimeStamp;

	@Column(name = "supplier_Transaction_Id")
	private String supplierTransactionId; //682-697

	@Column(name = "external_Costs_Noise")
	private String externalCostsNoise; //698 -708

	@Column(name = "external_Costs_Air")
	private String externalCostsAir; //709 -719

	@Column(name = "external_Costs_Noise_Or_Air_Digits")
	private String externalCostsNoiseOrAirDigits; //731-731

	@Column(name = "emission_Class")
	private String emissionClass; //732-737

	@Column(name = "engin_Characteristics")
	private String enginCharacteristics; // Fuel Type 738-740

	@Column(name = "vehicle_CO2")
	private String vehicleCO2; // 741 -742

	@Column(name = "vehicle_Weight")
	private String vehicleWeight; //743-746

	public Long getId() {
		return register_identifier;
	}

	public void setId(Long register_identifier) {
		this.register_identifier = register_identifier;
	}
	
	//@PositionalField(initialPosition = 2, finalPosition = 3)
	public String getSupplierProductCode() {
		return supplierProductCode;
	}
	public void setSupplierProductCode(String supplierProductCode) {
		this.supplierProductCode = supplierProductCode;
	}
	
	//@PositionalField(initialPosition = 4, finalPosition = 22)
	public String getObu_pan() {
		return obu_pan;
	}
	public void setObu_pan(String obu_pan) {
		this.obu_pan = obu_pan;
	}
	
	//@PositionalField(initialPosition = 23, finalPosition = 28)
	public String getTspActorId() {
		return tspActorId;
	}
	public void setTspActorId(String tspActorId) {
		this.tspActorId = tspActorId;
	}
	
	//@PositionalField(initialPosition = 34, finalPosition = 47)
	public String getTransitEntryTime() {
		return transitEntryTime;
	}
	public void setTransitEntryTime(String transitEntryTime) {
		this.transitEntryTime = transitEntryTime;
	}
	
	//@PositionalField(initialPosition = 50, finalPosition = 55)
	public String getEntryStationActorID() {
		return entryStationActorID;
	}
	public void setEntryStationActorID(String entryStationActorID) {
		this.entryStationActorID = entryStationActorID;
	}
	
	//@PositionalField(initialPosition = 56, finalPosition = 56)
	public String getEntryNetworkCode() {
		return entryNetworkCode;
	}
	public void setEntryNetworkCode(String entryNetworkCode) {
		this.entryNetworkCode = entryNetworkCode;
	}
	
	//@PositionalField(initialPosition = 57, finalPosition = 60)
	public String getEntryTerminalCode() {
		return entryTerminalCode;
	}
	public void setEntryTerminalCode(String entryTerminalCode) {
		this.entryTerminalCode = entryTerminalCode;
	}
	
	//@PositionalField(initialPosition = 61, finalPosition = 74)
	public String getTransitExitTime() {
		return transitExitTime;
	}
	public void setTransitExitTime(String transitExitTime) {
		this.transitExitTime = transitExitTime;
	}
	
	//@PositionalField(initialPosition = 77, finalPosition = 82)
	public String getExitStationActorID() {
		return exitStationActorID;
	}
	public void setExitStationActorID(String exitStationActorID) {
		this.exitStationActorID = exitStationActorID;
	}
	
	//@PositionalField(initialPosition = 83, finalPosition = 83)
	public String getExitNetworkCode() {
		return exitNetworkCode;
	}
	public void setExitNetworkCode(String exitNetworkCode) {
		this.exitNetworkCode = exitNetworkCode;
	}
	
	//@PositionalField(initialPosition = 84, finalPosition = 87)
	public String getExitTerminalCode() {
		return exitTerminalCode;
	}
	public void setExitTerminalCode(String exitTerminalCode) {
		this.exitTerminalCode = exitTerminalCode;
	}
	
	//@PositionalField(initialPosition = 88, finalPosition = 91)
	public String getTransactionLane() {
		return transactionLane;
	}
	public void setTransactionLane(String transactionLane) {
		this.transactionLane = transactionLane;
	}
	
	//@PositionalField(initialPosition = 92, finalPosition = 93)
	public String getTransactionTariff() {
		return transactionTariff;
	}
	public void setTransactionTariff(String transactionTariff) {
		this.transactionTariff = transactionTariff;
	}
	
	//@PositionalField(initialPosition = 94, finalPosition = 94)
	public String getVehicleClass() {
		return vehicleClass;
	}
	public void setVehicleClass(String vehicleClass) {
		this.vehicleClass = vehicleClass;
	}
	
	//@PositionalField(initialPosition = 104, finalPosition = 109)
	public String getVehicleAxles() {
		return vehicleAxles;
	}
	public void setVehicleAxles(String vehicleAxles) {
		this.vehicleAxles = vehicleAxles;
	}
	
	//@PositionalField(initialPosition = 115, finalPosition = 125)
	public String getNetAmount() {
		return netAmount;
	}
	public void setNetAmount(String netAmount) {
		this.netAmount = netAmount;
	}
	
	//@PositionalField(initialPosition = 126, finalPosition = 136)
	public String getVatAmount() {
		return vatAmount;
	}
	public void setVatAmount(String vatAmount) {
		this.vatAmount = vatAmount;
	}
	
	//@PositionalField(initialPosition = 137, finalPosition = 147)
	public String getGrossAmount() {
		return grossAmount;
	}
	public void setGrossAmount(String grossAmount) {
		this.grossAmount = grossAmount;
	}
	
	//@PositionalField(initialPosition = 148, finalPosition = 150)
	public String getSupplierCurrency() {
		return supplierCurrency;
	}
	public void setSupplierCurrency(String supplierCurrency) {
		this.supplierCurrency = supplierCurrency;
	}
	
	//@PositionalField(initialPosition = 151, finalPosition = 154)
	public String getProductCodeVATRate() {
		return productCodeVATRate;
	}
	public void setProductCodeVATRate(String productCodeVATRate) {
		this.productCodeVATRate = productCodeVATRate;
	}
	
	//@PositionalField(initialPosition = 159, finalPosition = 160)
	public String getLevelOfSecurity() {
		return levelOfSecurity;
	}
	public void setLevelOfSecurity(String levelOfSecurity) {
		this.levelOfSecurity = levelOfSecurity;
	}
	
	//@PositionalField(initialPosition = 190, finalPosition = 214)
	public String getSupplierTransaDescription() {
		return supplierTransaDescription;
	}
	public void setSupplierTransaDescription(String supplierTransaDescription) {
		this.supplierTransaDescription = supplierTransaDescription;
	}
	
	//@PositionalField(initialPosition = 240, finalPosition = 249)
	public String getVehiclePlateNumber() {
		return vehiclePlateNumber;
	}
	public void setVehiclePlateNumber(String vehiclePlateNumber) {
		this.vehiclePlateNumber = vehiclePlateNumber;
	}
	
	//@PositionalField(initialPosition = 250, finalPosition = 251)
	public String getVehicleCountry() {
		return vehicleCountry;
	}
	public void setVehicleCountry(String vehicleCountry) {
		this.vehicleCountry = vehicleCountry;
	}
	
	//@PositionalField(initialPosition = 264, finalPosition = 282)
	public String getValidationNATListId() {
		return validationNATListId;
	}
	public void setValidationNATListId(String validationNATListId) {
		this.validationNATListId = validationNATListId;
	}
	
	//@PositionalField(initialPosition = 293, finalPosition = 295)
	public String getVehicleFuelType() {
		return vehicleFuelType;
	}
	public void setVehicleFuelType(String vehicleFuelType) {
		this.vehicleFuelType = vehicleFuelType;
	}
	
	//@PositionalField(initialPosition = 296, finalPosition = 297)
	public String getVehicleEuronorm() {
		return vehicleEuronorm;
	}
	public void setVehicleEuronorm(String vehicleEuronorm) {
		this.vehicleEuronorm = vehicleEuronorm;
	}
	
	//@PositionalField(initialPosition = 298, finalPosition = 299)
	public String getVehicleTariffClass() {
		return vehicleTariffClass;
	}
	public void setVehicleTariffClass(String vehicleTariffClass) {
		this.vehicleTariffClass = vehicleTariffClass;
	}
	
	//@PositionalField(initialPosition = 603, finalPosition = 614)
	public String getContextMark() {
		return contextMark;
	}
	public void setContextMark(String contextMark) {
		this.contextMark = contextMark;
	}
	
//	@PositionalField(initialPosition = 615, finalPosition = 632)
	public String getObe_pan() {
		return obe_pan;
	}
	public void setObe_pan(String obe_pan) {
		this.obe_pan = obe_pan;
	}
	
	//@PositionalField(initialPosition = 652, finalPosition = 667)
	public String getTrxAggregateNbr() {
		return trxAggregateNbr;
	}
	public void setTrxAggregateNbr(String trxAggregateNbr) {
		this.trxAggregateNbr = trxAggregateNbr;
	}
	
	//@PositionalField(initialPosition = 668, finalPosition = 681)
	public String getUtcTimeStamp() {
		return utcTimeStamp;
	}
	public void setUtcTimeStamp(String utcTimeStamp) {
		this.utcTimeStamp = utcTimeStamp;
	}
	
	
	//@PositionalField(initialPosition = 682, finalPosition = 697)
	public String getSupplierTransactionId() {
		return supplierTransactionId;
	}

	public void setSupplierTransactionId(String supplierTransactionId) {
		this.supplierTransactionId = supplierTransactionId;
	}
	
	
	//@PositionalField(initialPosition = 698, finalPosition = 708)
	public String getExternalCostsNoise() {
		return externalCostsNoise;
	}

	public void setExternalCostsNoise(String externalCostsNoise) {
		this.externalCostsNoise = externalCostsNoise;
	}
	
	//@PositionalField(initialPosition = 709, finalPosition = 719)
	public String getExternalCostsAir() {
		return externalCostsAir;
	}
	public void setExternalCostsAir(String externalCostsAir) {
		this.externalCostsAir = externalCostsAir;
	}
	
	//@PositionalField(initialPosition = 731, finalPosition = 731)
	public String getExternalCostsNoiseOrAirDigits() {
		return externalCostsNoiseOrAirDigits;
	}
	public void setExternalCostsNoiseOrAirDigits(String externalCostsNoiseOrAirDigits) {
		this.externalCostsNoiseOrAirDigits = externalCostsNoiseOrAirDigits;
	}
	
	//@PositionalField(initialPosition = 732, finalPosition = 737)
	public String getEmissionClass() {
		return emissionClass;
	}
	public void setEmissionClass(String emissionClass) {
		this.emissionClass = emissionClass;
	}
	
	//@PositionalField(initialPosition = 738, finalPosition = 740)
	public String getEnginCharacteristics() {
		return enginCharacteristics;
	}
	public void setEnginCharacteristics(String enginCharacteristics) {
		this.enginCharacteristics = enginCharacteristics;
	}
	
	//@PositionalField(initialPosition = 741, finalPosition = 742)
	public String getVehicleCO2() {
		return vehicleCO2;
	}
	public void setVehicleCO2(String vehicleCO2) {
		this.vehicleCO2 = vehicleCO2;
	}
	
	//@PositionalField(initialPosition = 743, finalPosition = 746)
	public String getVehicleWeight() {
		return vehicleWeight;
	}
	public void setVehicleWeight(String vehicleWeight) {
		this.vehicleWeight = vehicleWeight;
	}

	@Override
	public String toString() {
		return "TransactionFileBodyDTO [register_identifier=" + register_identifier + ", supplierProductCode="
				+ supplierProductCode + ", obu_pan=" + obu_pan + ", tspActorId=" + tspActorId + ", transitEntryTime="
				+ transitEntryTime + ", entryStationActorID=" + entryStationActorID + ", entryNetworkCode="
				+ entryNetworkCode + ", entryTerminalCode=" + entryTerminalCode + ", transitExitTime=" + transitExitTime
				+ ", exitStationActorID=" + exitStationActorID + ", exitNetworkCode=" + exitNetworkCode
				+ ", exitTerminalCode=" + exitTerminalCode + ", transactionLane=" + transactionLane
				+ ", transactionTariff=" + transactionTariff + ", vehicleClass=" + vehicleClass + ", vehicleAxles="
				+ vehicleAxles + ", netAmount=" + netAmount + ", vatAmount=" + vatAmount + ", grossAmount="
				+ grossAmount + ", supplierCurrency=" + supplierCurrency + ", productCodeVATRate=" + productCodeVATRate
				+ ", levelOfSecurity=" + levelOfSecurity + ", supplierTransaDescription=" + supplierTransaDescription
				+ ", vehiclePlateNumber=" + vehiclePlateNumber + ", vehicleCountry=" + vehicleCountry
				+ ", validationNATListId=" + validationNATListId + ", vehicleFuelType=" + vehicleFuelType
				+ ", vehicleEuronorm=" + vehicleEuronorm + ", vehicleTariffClass=" + vehicleTariffClass
				+ ", contextMark=" + contextMark + ", obe_pan=" + obe_pan + ", trxAggregateNbr=" + trxAggregateNbr
				+ ", utcTimeStamp=" + utcTimeStamp + ", supplierTransactionId=" + supplierTransactionId
				+ ", externalCostsNoise=" + externalCostsNoise + ", externalCostsAir=" + externalCostsAir
				+ ", externalCostsNoiseOrAirDigits=" + externalCostsNoiseOrAirDigits + ", emissionClass="
				+ emissionClass + ", enginCharacteristics=" + enginCharacteristics + ", vehicleCO2=" + vehicleCO2
				+ ", vehicleWeight=" + vehicleWeight + "]";
	}
	
}
