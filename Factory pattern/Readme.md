Giới thiệu

Factory Pattern là một mẫu phổ biến trong OOP.
Nhiệm vụ của Factory Pattern là quản lý và trả về các đối tượng theo yêu cầu, giúp cho việc khởi tạo đối 
tượng một cách linh hoạt hơn. Nói cách khác, Factory cho phép chúng ta tạo ra một địa điểm tập trung các đối tượng đã được tạo ra.


Ví dụ một ông chủ giàu có muốn đi mua xe, thay vì phải đến từng hãng xe để lựa chọn, ông ta có thể đi đến một cửa hàng, nơi tổng hợp, có chứa tất cả các hãng xe theo yêu cầu. Điều đó rút ngắn được thời gian và công sức khi muốn lựa chọn các hãng xe khác nhau.
Ta tạo ra các lớp hãng xe như BMW, Honda, Mercedes, sau đó ta tạo ra một lớp CarFactory, nơi chứa tất cả các loại xe đó.
Nếu ông chủ (class Boss) muốn thực hiện chức năng viewCar(), ta khởi tạo một lớp CarFactory và truyền vào loại xe muốn xem thông qua phương thức viewCar(loại xe)