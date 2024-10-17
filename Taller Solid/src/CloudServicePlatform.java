public class CloudServicePlatform {
    private CloudService cloudService;

    public CloudServicePlatform(CloudService cloudService) {
        this.cloudService = cloudService;
    }

    public void hostingTo() {
        cloudService.connect();  // Se llama al método connect de la interfaz
    }
}

